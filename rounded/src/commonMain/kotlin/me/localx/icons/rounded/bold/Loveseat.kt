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

public val Icons.Bold.Loveseat: ImageVector
    get() {
        if (_loveseat != null) {
            return _loveseat!!
        }
        _loveseat = Builder(name = "Loveseat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.051f)
                verticalLineToRelative(-0.551f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 1.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(0.551f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.449f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.704f, 0.779f, 3.23f, 2.0f, 4.239f)
                verticalLineToRelative(1.761f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.525f)
                curveToRelative(0.165f, 0.015f, 0.331f, 0.025f, 0.5f, 0.025f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.169f, 0.0f, 0.335f, -0.01f, 0.5f, -0.025f)
                verticalLineToRelative(0.525f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.761f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.239f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.207f, -0.86f, -2.217f, -2.0f, -2.449f)
                close()
                moveTo(10.5f, 18.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-0.585f)
                curveToRelative(0.144f, 0.046f, 0.341f, 0.085f, 0.5f, 0.085f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.574f, 0.0f, -2.996f, 0.665f, -4.0f, 1.729f)
                curveToRelative(-1.004f, -1.064f, -2.426f, -1.729f, -4.0f, -1.729f)
                close()
                moveTo(21.0f, 15.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.159f, 0.0f, 0.356f, -0.039f, 0.5f, -0.085f)
                verticalLineToRelative(0.585f)
                close()
            }
        }
        .build()
        return _loveseat!!
    }

private var _loveseat: ImageVector? = null
