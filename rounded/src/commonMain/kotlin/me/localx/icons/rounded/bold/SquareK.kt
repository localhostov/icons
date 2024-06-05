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

public val Icons.Bold.SquareK: ImageVector
    get() {
        if (_squareK != null) {
            return _squareK!!
        }
        _squareK = Builder(name = "SquareK", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(17.748f, 16.668f)
                curveToRelative(0.46f, 0.689f, 0.273f, 1.621f, -0.416f, 2.08f)
                curveToRelative(-0.256f, 0.17f, -0.545f, 0.252f, -0.831f, 0.252f)
                curveToRelative(-0.484f, 0.0f, -0.96f, -0.234f, -1.249f, -0.668f)
                lineToRelative(-3.555f, -5.332f)
                horizontalLineToRelative(-2.697f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(6.0f, 6.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.779f)
                lineToRelative(3.55f, -4.437f)
                curveToRelative(0.517f, -0.646f, 1.459f, -0.752f, 2.108f, -0.234f)
                curveToRelative(0.646f, 0.518f, 0.751f, 1.461f, 0.233f, 2.108f)
                lineToRelative(-3.314f, 4.144f)
                lineToRelative(3.392f, 5.087f)
                close()
            }
        }
        .build()
        return _squareK!!
    }

private var _squareK: ImageVector? = null
