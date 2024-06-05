package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.842f, 5.059f)
                curveTo(18.246f, 1.6f, 16.056f, 0.0f, 14.0f, 0.0f)
                lineTo(14.0f, 2.0f)
                curveToRelative(1.174f, 0.0f, 2.358f, 1.065f, 2.81f, 3.119f)
                arcTo(6.01f, 6.01f, 0.0f, false, false, 12.0f, 11.0f)
                curveToRelative(0.0f, 2.5f, -2.38f, 4.0f, -4.681f, 4.0f)
                curveToRelative(-3.471f, 0.0f, -4.628f, -2.8f, -4.986f, -5.15f)
                lineTo(2.2f, 9.0f)
                lineTo(0.357f, 9.0f)
                lineToRelative(-0.15f, 0.819f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                lineTo(24.0f, 11.0f)
                arcTo(6.009f, 6.009f, 0.0f, false, false, 18.842f, 5.059f)
                close()
                moveTo(20.381f, 7.787f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, true, -4.762f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.762f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.452f, 14.976f)
                arcTo(6.373f, 6.373f, 0.0f, false, false, 7.319f, 17.0f)
                curveTo(11.065f, 17.0f, 14.0f, 14.364f, 14.0f, 11.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, 0.343f, -1.621f)
                arcToRelative(4.936f, 4.936f, 0.0f, false, false, 7.314f, 0.0f)
                arcTo(3.987f, 3.987f, 0.0f, false, true, 22.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
