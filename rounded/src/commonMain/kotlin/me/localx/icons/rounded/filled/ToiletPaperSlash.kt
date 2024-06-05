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

public val Icons.Filled.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.417f, 2.417f)
                curveToRelative(0.91f, -1.665f, 2.296f, -2.71f, 3.876f, -2.71f)
                horizontalLineToRelative(9.868f)
                curveToRelative(-1.273f, 2.009f, -1.868f, 5.262f, -1.868f, 8.5f)
                verticalLineToRelative(6.086f)
                lineToRelative(7.707f, 7.707f)
                close()
                moveTo(18.0f, 8.5f)
                curveToRelative(0.0f, -4.694f, 1.343f, -8.5f, 3.0f, -8.5f)
                reflectiveCurveToRelative(3.0f, 3.806f, 3.0f, 8.5f)
                reflectiveCurveToRelative(-1.343f, 8.5f, -3.0f, 8.5f)
                reflectiveCurveToRelative(-3.0f, -3.806f, -3.0f, -8.5f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, 1.657f, 0.448f, 3.0f, 1.0f, 3.0f)
                reflectiveCurveToRelative(1.0f, -1.343f, 1.0f, -3.0f)
                reflectiveCurveToRelative(-0.448f, -3.0f, -1.0f, -3.0f)
                reflectiveCurveToRelative(-1.0f, 1.343f, -1.0f, 3.0f)
                close()
                moveTo(4.716f, 8.941f)
                curveToRelative(-0.634f, -0.633f, -1.717f, -0.187f, -1.717f, 0.709f)
                curveToRelative(0.0f, 3.177f, 0.0f, 8.35f, 0.0f, 8.35f)
                curveToRelative(0.0f, 1.234f, -0.741f, 2.328f, -1.888f, 2.787f)
                curveToRelative(-0.676f, 0.27f, -1.112f, 0.881f, -1.112f, 1.559f)
                curveToRelative(0.0f, 0.912f, 0.742f, 1.654f, 1.654f, 1.654f)
                horizontalLineToRelative(9.346f)
                curveToRelative(2.033f, 0.0f, 3.787f, -1.22f, 4.568f, -2.967f)
                curveToRelative(0.235f, -0.527f, 0.093f, -1.15f, -0.315f, -1.558f)
                lineTo(4.716f, 8.941f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
