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

public val Icons.Filled.Customize: ImageVector
    get() {
        if (_customize != null) {
            return _customize!!
        }
        _customize = Builder(name = "Customize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.836f, 6.25f)
                lineToRelative(-7.75f, 7.75f)
                horizontalLineToRelative(-3.086f)
                verticalLineToRelative(-3.086f)
                lineToRelative(7.75f, -7.75f)
                lineToRelative(3.086f, 3.086f)
                close()
                moveTo(23.361f, 0.639f)
                curveToRelative(-0.852f, -0.852f, -2.234f, -0.852f, -3.086f, 0.0f)
                lineToRelative(-1.111f, 1.111f)
                lineToRelative(3.086f, 3.086f)
                lineToRelative(1.111f, -1.111f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                close()
                moveTo(22.948f, 6.966f)
                lineToRelative(-9.034f, 9.034f)
                horizontalLineToRelative(-5.914f)
                verticalLineToRelative(-5.914f)
                lineToRelative(7.0f, -7.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.522f)
                curveToRelative(-1.047f, 0.37f, -2.016f, 0.929f, -2.857f, 1.649f)
                lineToRelative(-3.051f, -1.754f)
                lineTo(0.102f, 8.619f)
                lineToRelative(3.052f, 1.755f)
                curveToRelative(-0.102f, 0.544f, -0.153f, 1.088f, -0.153f, 1.626f)
                reflectiveCurveToRelative(0.051f, 1.082f, 0.153f, 1.626f)
                lineTo(0.102f, 15.381f)
                lineToRelative(2.99f, 5.201f)
                lineToRelative(3.051f, -1.754f)
                curveToRelative(0.841f, 0.721f, 1.81f, 1.279f, 2.857f, 1.649f)
                verticalLineToRelative(3.522f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.522f)
                curveToRelative(1.047f, -0.37f, 2.016f, -0.929f, 2.857f, -1.649f)
                lineToRelative(3.05f, 1.754f)
                lineToRelative(2.991f, -5.201f)
                lineToRelative(-3.052f, -1.756f)
                curveToRelative(0.102f, -0.544f, 0.153f, -1.088f, 0.153f, -1.625f)
                reflectiveCurveToRelative(-0.051f, -1.081f, -0.153f, -1.625f)
                lineToRelative(3.052f, -1.756f)
                lineToRelative(-0.951f, -1.653f)
                close()
            }
        }
        .build()
        return _customize!!
    }

private var _customize: ImageVector? = null
