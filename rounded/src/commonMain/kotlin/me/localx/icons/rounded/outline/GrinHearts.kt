package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.5f, -1.248f, 21.5f, -1.244f, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(17.842f, 15.542f)
                arcTo(6.827f, 6.827f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -5.848f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.2f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.792f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.842f, 15.542f)
                close()
                moveTo(19.0f, 8.65f)
                curveToRelative(0.0f, 1.3f, -1.692f, 2.818f, -2.535f, 3.494f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.93f, 0.0f)
                curveToRelative(-5.7f, -4.279f, 0.059f, -7.109f, 0.465f, -3.494f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 19.0f, 8.65f)
                close()
                moveTo(5.0f, 8.65f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                curveToRelative(0.41f, -3.617f, 6.167f, -0.78f, 0.465f, 3.494f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.93f, 0.0f)
                curveTo(6.692f, 11.468f, 5.0f, 9.948f, 5.0f, 8.65f)
                close()
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
