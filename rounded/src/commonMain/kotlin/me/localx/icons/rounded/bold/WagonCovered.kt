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

public val Icons.Bold.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 21.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(12.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 19.0f)
                close()
                moveTo(23.918f, 4.454f)
                lineTo(22.0f, 13.654f)
                lineTo(22.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(19.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(2.0f, 13.654f)
                lineTo(0.075f, 4.424f)
                arcTo(3.132f, 3.132f, 0.0f, false, true, 3.693f, 0.66f)
                curveTo(3.834f, 0.687f, 5.146f, 0.991f, 5.331f, 1.0f)
                curveToRelative(1.0f, 0.0f, 1.874f, -1.0f, 3.169f, -1.0f)
                reflectiveCurveTo(10.974f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(2.185f, -1.0f, 3.605f, -1.0f)
                reflectiveCurveToRelative(2.528f, 1.0f, 3.077f, 1.0f)
                arcTo(8.111f, 8.111f, 0.0f, false, false, 20.307f, 0.66f)
                arcToRelative(3.132f, 3.132f, 0.0f, false, true, 3.611f, 3.794f)
                close()
                moveTo(3.0f, 3.78f)
                lineTo(4.719f, 12.0f)
                lineTo(19.281f, 12.0f)
                lineToRelative(1.708f, -8.189f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, false, -0.032f, -0.167f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.035f)
                curveToRelative(-0.109f, 0.021f, -0.268f, 0.058f, -0.447f, 0.1f)
                arcTo(4.785f, 4.785f, 0.0f, false, true, 17.0f, 3.648f)
                lineTo(17.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(14.0f, 3.65f)
                arcToRelative(6.107f, 6.107f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(10.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(7.0f, 3.648f)
                arcToRelative(4.78f, 4.78f, 0.0f, false, true, -3.412f, 0.061f)
                curveToRelative(-0.179f, -0.042f, -0.338f, -0.079f, -0.447f, -0.1f)
                arcToRelative(0.094f, 0.094f, 0.0f, false, false, -0.1f, 0.035f)
                arcTo(0.142f, 0.142f, 0.0f, false, false, 3.0f, 3.78f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
