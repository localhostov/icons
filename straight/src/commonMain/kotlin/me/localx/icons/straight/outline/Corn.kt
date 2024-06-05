package me.localx.icons.straight.outline

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

public val Icons.Outline.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.758f, 10.03f)
                arcTo(13.044f, 13.044f, 0.0f, false, false, 19.0f, 11.06f)
                curveTo(18.684f, 5.161f, 15.49f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.316f, 5.161f, 5.005f, 11.06f)
                arcToRelative(13.044f, 13.044f, 0.0f, false, false, -2.763f, -1.03f)
                lineTo(1.0f, 9.719f)
                lineTo(1.0f, 11.0f)
                curveToRelative(0.0f, 9.609f, 6.284f, 12.612f, 10.212f, 12.964f)
                lineTo(12.0f, 24.0f)
                lineToRelative(0.788f, -0.036f)
                curveTo(16.716f, 23.612f, 23.0f, 20.609f, 23.0f, 11.0f)
                lineTo(23.0f, 9.719f)
                close()
                moveTo(3.052f, 12.38f)
                arcTo(11.3f, 11.3f, 0.0f, false, true, 7.0f, 15.0f)
                verticalLineToRelative(0.0f)
                lineTo(7.0f, 15.0f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, true, 3.942f, 6.92f)
                curveTo(7.923f, 21.48f, 3.575f, 19.113f, 3.052f, 12.38f)
                close()
                moveTo(12.0f, 18.95f)
                arcTo(18.506f, 18.506f, 0.0f, false, false, 9.683f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 13.0f)
                lineTo(7.826f, 13.0f)
                quadToRelative(-0.4f, -0.36f, -0.844f, -0.7f)
                quadToRelative(0.0f, -0.152f, 0.0f, -0.3f)
                curveToRelative(0.0f, -0.339f, 0.012f, -0.672f, 0.032f, -1.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 9.0f)
                lineTo(7.266f, 9.0f)
                arcTo(14.921f, 14.921f, 0.0f, false, true, 7.8f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 5.0f)
                lineTo(8.672f, 5.0f)
                curveTo(9.693f, 3.13f, 10.987f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(2.307f, 1.13f, 3.328f, 3.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(3.2f)
                arcToRelative(14.921f, 14.921f, 0.0f, false, true, 0.532f, 2.0f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.989f)
                curveToRelative(0.02f, 0.328f, 0.032f, 0.661f, 0.032f, 1.0f)
                quadToRelative(0.0f, 0.152f, 0.0f, 0.3f)
                quadToRelative(-0.441f, 0.336f, -0.844f, 0.7f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.317f)
                arcTo(18.506f, 18.506f, 0.0f, false, false, 12.0f, 18.95f)
                close()
                moveTo(13.054f, 21.92f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 17.0f, 15.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 3.948f, -2.616f)
                curveTo(20.425f, 19.113f, 16.077f, 21.48f, 13.054f, 21.92f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
