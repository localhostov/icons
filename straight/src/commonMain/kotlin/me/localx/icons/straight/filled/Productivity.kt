package me.localx.icons.straight.filled

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

public val Icons.Filled.Productivity: ImageVector
    get() {
        if (_productivity != null) {
            return _productivity!!
        }
        _productivity = Builder(name = "Productivity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 12.0f)
                curveToRelative(0.0f, -0.538f, -0.052f, -1.082f, -0.153f, -1.626f)
                lineToRelative(3.052f, -1.755f)
                lineToRelative(-2.991f, -5.201f)
                lineToRelative(-3.051f, 1.754f)
                curveToRelative(-0.841f, -0.721f, -1.81f, -1.279f, -2.856f, -1.649f)
                lineTo(15.001f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.522f)
                curveToRelative(-1.047f, 0.37f, -2.016f, 0.929f, -2.857f, 1.649f)
                lineToRelative(-3.05f, -1.754f)
                lineTo(0.102f, 8.619f)
                lineToRelative(3.052f, 1.756f)
                curveToRelative(-0.102f, 0.544f, -0.153f, 1.088f, -0.153f, 1.625f)
                reflectiveCurveToRelative(0.051f, 1.081f, 0.153f, 1.625f)
                lineTo(0.102f, 15.381f)
                lineToRelative(2.991f, 5.201f)
                lineToRelative(3.05f, -1.754f)
                curveToRelative(0.841f, 0.721f, 1.81f, 1.279f, 2.857f, 1.649f)
                verticalLineToRelative(3.522f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.522f)
                curveToRelative(1.047f, -0.37f, 2.016f, -0.929f, 2.856f, -1.649f)
                lineToRelative(3.051f, 1.754f)
                lineToRelative(2.991f, -5.201f)
                lineToRelative(-3.052f, -1.755f)
                curveToRelative(0.102f, -0.544f, 0.153f, -1.088f, 0.153f, -1.626f)
                close()
                moveTo(15.0f, 12.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.052f, -3.052f)
                curveToRelative(0.727f, -0.729f, 1.997f, -0.729f, 2.726f, 0.0f)
                lineToRelative(3.051f, 3.052f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _productivity!!
    }

private var _productivity: ImageVector? = null
