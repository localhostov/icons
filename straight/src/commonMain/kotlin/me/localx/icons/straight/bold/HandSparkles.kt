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

public val Icons.Bold.HandSparkles: ImageVector
    get() {
        if (_handSparkles != null) {
            return _handSparkles!!
        }
        _handSparkles = Builder(name = "HandSparkles", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.5f)
                verticalLineToRelative(14.764f)
                lineToRelative(-0.843f, -0.421f)
                lineToRelative(-2.157f, -4.314f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.528f, 21.0f)
                horizontalLineToRelative(-3.446f)
                lineToRelative(-1.095f, -1.001f)
                lineTo(8.987f, 3.58f)
                curveToRelative(0.0f, -0.747f, -0.511f, -1.44f, -1.248f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.739f, 0.568f, -1.739f, 1.479f)
                verticalLineToRelative(12.269f)
                lineToRelative(-2.64f, -2.296f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(4.504f, 4.04f)
                lineToRelative(3.667f, 3.351f)
                horizontalLineToRelative(9.346f)
                lineToRelative(-0.421f, -0.843f)
                lineToRelative(-4.315f, -2.157f)
                close()
                moveTo(11.5f, 16.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
                moveTo(2.5f, 9.0f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(0.833f, 1.667f)
                close()
                moveTo(20.5f, 17.0f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                close()
                moveTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 1.5f)
                close()
                moveTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 1.5f)
                close()
            }
        }
        .build()
        return _handSparkles!!
    }

private var _handSparkles: ImageVector? = null
