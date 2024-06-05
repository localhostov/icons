package me.localx.icons.rounded.filled

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

public val Icons.Filled.Mortgage: ImageVector
    get() {
        if (_mortgage != null) {
            return _mortgage!!
        }
        _mortgage = Builder(name = "Mortgage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.083f, 6.548f)
                lineToRelative(-0.083f, -0.065f)
                verticalLineToRelative(-3.483f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.916f)
                lineToRelative(-4.917f, -3.852f)
                curveToRelative(-1.815f, -1.422f, -4.352f, -1.422f, -6.167f, 0.0f)
                lineTo(1.917f, 6.548f)
                curveToRelative(-1.218f, 0.954f, -1.917f, 2.389f, -1.917f, 3.936f)
                verticalLineToRelative(8.516f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.516f)
                curveToRelative(0.0f, -1.547f, -0.699f, -2.982f, -1.917f, -3.936f)
                close()
                moveTo(7.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(9.999f, 19.0f)
                curveToRelative(-0.168f, 0.0f, -0.339f, -0.042f, -0.495f, -0.132f)
                curveToRelative(-0.479f, -0.274f, -0.646f, -0.885f, -0.372f, -1.364f)
                lineToRelative(4.0f, -7.0f)
                curveToRelative(0.274f, -0.479f, 0.885f, -0.645f, 1.364f, -0.372f)
                curveToRelative(0.479f, 0.274f, 0.646f, 0.885f, 0.372f, 1.364f)
                lineToRelative(-4.0f, 7.0f)
                curveToRelative(-0.185f, 0.323f, -0.522f, 0.504f, -0.869f, 0.504f)
                close()
                moveTo(15.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mortgage!!
    }

private var _mortgage: ImageVector? = null
