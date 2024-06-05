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

public val Icons.Bold.SofaSize: ImageVector
    get() {
        if (_sofaSize != null) {
            return _sofaSize!!
        }
        _sofaSize = Builder(name = "SofaSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 13.051f)
                verticalLineToRelative(-0.551f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 7.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(0.551f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.449f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.557f, 0.795f, 2.93f, 2.0f, 3.738f)
                verticalLineToRelative(1.262f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.262f)
                curveToRelative(1.205f, -0.808f, 2.0f, -2.182f, 2.0f, -3.738f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.207f, -0.86f, -2.217f, -2.0f, -2.449f)
                close()
                moveTo(5.0f, 12.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(0.227f, 4.048f)
                curveToRelative(-0.302f, -0.303f, -0.302f, -0.793f, 0.0f, -1.096f)
                lineTo(2.678f, 0.502f)
                curveToRelative(0.488f, -0.488f, 1.322f, -0.142f, 1.322f, 0.548f)
                verticalLineToRelative(0.951f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-0.951f)
                curveToRelative(0.0f, -0.69f, 0.834f, -1.036f, 1.322f, -0.548f)
                lineToRelative(2.451f, 2.451f)
                curveToRelative(0.302f, 0.302f, 0.302f, 0.793f, 0.0f, 1.096f)
                lineToRelative(-2.451f, 2.451f)
                curveToRelative(-0.488f, 0.488f, -1.322f, 0.142f, -1.322f, -0.548f)
                verticalLineToRelative(-0.951f)
                lineTo(4.0f, 5.001f)
                verticalLineToRelative(0.951f)
                curveToRelative(0.0f, 0.69f, -0.834f, 1.036f, -1.322f, 0.548f)
                lineTo(0.227f, 4.048f)
                close()
            }
        }
        .build()
        return _sofaSize!!
    }

private var _sofaSize: ImageVector? = null
