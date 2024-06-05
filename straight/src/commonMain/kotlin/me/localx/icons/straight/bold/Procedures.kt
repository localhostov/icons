package me.localx.icons.straight.bold

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

public val Icons.Bold.Procedures: ImageVector
    get() {
        if (_procedures != null) {
            return _procedures!!
        }
        _procedures = Builder(name = "Procedures", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 11.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(18.279f, 3.0f)
                lineToRelative(-1.185f, 1.479f)
                lineTo(14.066f, 0.047f)
                lineToRelative(-2.3f, 2.953f)
                horizontalLineToRelative(-5.767f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.233f)
                lineToRelative(0.675f, -0.867f)
                lineToRelative(2.997f, 4.388f)
                lineToRelative(2.815f, -3.521f)
                horizontalLineToRelative(4.279f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.721f)
                close()
                moveTo(20.679f, 8.005f)
                lineToRelative(-2.396f, 2.995f)
                horizontalLineToRelative(2.217f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.994f)
                lineToRelative(-2.049f, -2.999f)
                curveToRelative(-1.904f, 0.029f, -3.445f, 1.588f, -3.445f, 3.499f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0.0f, -1.87f, -1.474f, -3.402f, -3.321f, -3.495f)
                close()
            }
        }
        .build()
        return _procedures!!
    }

private var _procedures: ImageVector? = null
