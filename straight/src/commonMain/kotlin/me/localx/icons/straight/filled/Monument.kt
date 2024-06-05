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

public val Icons.Filled.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.354f, 5.0f)
                curveToRelative(-0.084f, -0.655f, -0.384f, -1.273f, -0.852f, -1.741f)
                lineTo(14.122f, 0.879f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-2.381f, 2.38f)
                curveToRelative(-0.468f, 0.468f, -0.768f, 1.086f, -0.852f, 1.741f)
                horizontalLineToRelative(10.707f)
                close()
                moveTo(17.592f, 7.0f)
                horizontalLineToRelative(-4.592f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 7.0f)
                lineTo(6.408f, 7.0f)
                lineToRelative(-1.294f, 11.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.114f)
                lineToRelative(-1.294f, -11.0f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
