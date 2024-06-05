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

public val Icons.Bold.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                horizontalLineToRelative(1.071f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0.0f)
                lineToRelative(1.939f, -1.939f)
                horizontalLineToRelative(0.929f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(17.999f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 5.41f)
                verticalLineToRelative(16.408f)
                lineToRelative(-12.0f, 2.181f)
                lineTo(0.0f, 21.817f)
                lineTo(0.0f, 5.41f)
                curveToRelative(0.0f, -0.943f, 0.376f, -1.819f, 1.058f, -2.469f)
                curveToRelative(0.649f, -0.618f, 1.524f, -0.95f, 2.413f, -0.931f)
                curveToRelative(0.033f, 0.0f, 0.385f, 0.018f, 0.529f, 0.044f)
                verticalLineToRelative(3.048f)
                reflectiveCurveToRelative(-0.555f, -0.101f, -0.574f, -0.102f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.158f, -0.006f, -0.252f, 0.068f, -0.3f, 0.114f)
                curveToRelative(-0.058f, 0.055f, -0.126f, 0.15f, -0.126f, 0.295f)
                verticalLineToRelative(13.904f)
                lineToRelative(7.5f, 1.364f)
                verticalLineToRelative(-4.677f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.677f)
                lineToRelative(7.5f, -1.364f)
                lineTo(21.0f, 5.41f)
                curveToRelative(0.0f, -0.167f, -0.092f, -0.268f, -0.147f, -0.314f)
                curveToRelative(-0.055f, -0.046f, -0.171f, -0.118f, -0.335f, -0.088f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.518f, 0.094f, -0.518f, 0.094f)
                verticalLineToRelative(-3.046f)
                curveToRelative(1.0f, -0.179f, 1.998f, 0.088f, 2.775f, 0.737f)
                curveToRelative(0.778f, 0.649f, 1.225f, 1.604f, 1.225f, 2.617f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
