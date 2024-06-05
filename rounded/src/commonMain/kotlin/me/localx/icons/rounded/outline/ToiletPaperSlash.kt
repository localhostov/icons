package me.localx.icons.rounded.outline

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

public val Icons.Outline.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.843f, 20.249f)
                curveToRelative(-0.569f, 2.209f, -2.561f, 3.751f, -4.843f, 3.751f)
                lineTo(2.653f, 24.0f)
                curveToRelative(-1.463f, 0.0f, -2.653f, -1.19f, -2.653f, -2.653f)
                curveToRelative(0.0f, -1.089f, 0.684f, -2.066f, 1.741f, -2.488f)
                curveToRelative(0.765f, -0.306f, 1.259f, -1.035f, 1.259f, -1.858f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.646f, -0.987f, 3.104f, -2.517f, 3.716f)
                curveToRelative(-0.234f, 0.093f, -0.483f, 0.308f, -0.483f, 0.631f)
                curveToRelative(0.0f, 0.36f, 0.293f, 0.653f, 0.653f, 0.653f)
                horizontalLineToRelative(8.347f)
                curveToRelative(1.37f, 0.0f, 2.564f, -0.925f, 2.905f, -2.249f)
                curveToRelative(0.138f, -0.535f, 0.69f, -0.856f, 1.218f, -0.72f)
                curveToRelative(0.535f, 0.138f, 0.857f, 0.684f, 0.72f, 1.218f)
                close()
                moveTo(18.0f, 8.5f)
                curveToRelative(0.0f, 1.381f, 0.448f, 2.5f, 1.0f, 2.5f)
                reflectiveCurveToRelative(1.0f, -1.119f, 1.0f, -2.5f)
                reflectiveCurveToRelative(-0.448f, -2.5f, -1.0f, -2.5f)
                reflectiveCurveToRelative(-1.0f, 1.119f, -1.0f, 2.5f)
                close()
                moveTo(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.421f, 2.421f)
                curveToRelative(0.931f, -1.703f, 2.338f, -2.714f, 3.872f, -2.714f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.804f, 0.0f, 5.0f, 3.733f, 5.0f, 8.5f)
                reflectiveCurveToRelative(-2.196f, 8.5f, -5.0f, 8.5f)
                horizontalLineToRelative(-0.586f)
                lineToRelative(5.293f, 5.293f)
                close()
                moveTo(19.0f, 2.0f)
                curveToRelative(-1.419f, 0.0f, -3.0f, 2.67f, -3.0f, 6.5f)
                reflectiveCurveToRelative(1.581f, 6.5f, 3.0f, 6.5f)
                reflectiveCurveToRelative(3.0f, -2.67f, 3.0f, -6.5f)
                reflectiveCurveToRelative(-1.581f, -6.5f, -3.0f, -6.5f)
                close()
                moveTo(5.623f, 4.209f)
                lineToRelative(8.377f, 8.377f)
                verticalLineToRelative(-4.086f)
                curveToRelative(0.0f, -2.634f, 0.671f, -4.953f, 1.745f, -6.5f)
                horizontalLineToRelative(-7.745f)
                curveToRelative(-0.898f, 0.0f, -1.801f, 0.853f, -2.377f, 2.209f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
