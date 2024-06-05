package me.localx.icons.rounded.bold

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

public val Icons.Bold.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.893f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, 9.0f)
                curveToRelative(0.452f, 11.923f, 17.549f, 11.92f, 18.0f, 0.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
                moveTo(17.5f, 7.0f)
                arcTo(1.581f, 1.581f, 0.0f, false, false, 16.0f, 8.65f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 1.3f, 1.692f, 2.818f, 2.535f, 3.494f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, false, 0.93f, 0.0f)
                curveTo(17.308f, 11.468f, 19.0f, 9.948f, 19.0f, 8.65f)
                arcTo(1.581f, 1.581f, 0.0f, false, false, 17.5f, 7.0f)
                close()
                moveTo(9.5f, 7.0f)
                arcTo(1.581f, 1.581f, 0.0f, false, false, 8.0f, 8.65f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 1.3f, 1.692f, 2.818f, 2.535f, 3.494f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, false, 0.93f, 0.0f)
                curveTo(9.308f, 11.468f, 11.0f, 9.948f, 11.0f, 8.65f)
                arcTo(1.581f, 1.581f, 0.0f, false, false, 9.5f, 7.0f)
                close()
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
