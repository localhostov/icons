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

public val Icons.Filled.ToiletPaperUnderSlash: ImageVector
    get() {
        if (_toiletPaperUnderSlash != null) {
            return _toiletPaperUnderSlash!!
        }
        _toiletPaperUnderSlash = Builder(name = "ToiletPaperUnderSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.952f, 22.538f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.018f, 1.432f)
                lineTo(1.432f, 0.018f)
                lineToRelative(1.051f, 1.051f)
                curveToRelative(0.735f, -0.689f, 1.593f, -1.069f, 2.517f, -1.069f)
                horizontalLineToRelative(10.868f)
                curveToRelative(-1.273f, 2.009f, -1.868f, 5.262f, -1.868f, 8.5f)
                curveToRelative(0.0f, 1.542f, 0.135f, 3.087f, 0.414f, 4.5f)
                lineToRelative(5.771f, 5.771f)
                curveToRelative(0.707f, -0.287f, 1.311f, -0.832f, 1.814f, -1.566f)
                verticalLineToRelative(2.794f)
                curveToRelative(0.0f, 0.258f, 0.051f, 0.503f, 0.142f, 0.728f)
                lineToRelative(1.81f, 1.81f)
                close()
                moveTo(16.0f, 8.5f)
                curveToRelative(0.0f, -4.694f, 1.343f, -8.5f, 3.0f, -8.5f)
                reflectiveCurveToRelative(3.0f, 3.806f, 3.0f, 8.5f)
                reflectiveCurveToRelative(-1.343f, 8.5f, -3.0f, 8.5f)
                reflectiveCurveToRelative(-3.0f, -3.806f, -3.0f, -8.5f)
                close()
                moveTo(18.0f, 8.5f)
                curveToRelative(0.0f, 1.105f, 0.448f, 2.0f, 1.0f, 2.0f)
                reflectiveCurveToRelative(1.0f, -0.895f, 1.0f, -2.0f)
                reflectiveCurveToRelative(-0.448f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.895f, -1.0f, 2.0f)
                close()
                moveTo(0.48f, 4.702f)
                curveToRelative(-0.309f, 1.12f, -0.48f, 2.4f, -0.48f, 3.798f)
                curveToRelative(0.0f, 5.0f, 2.196f, 8.5f, 5.0f, 8.5f)
                horizontalLineToRelative(7.778f)
                lineTo(0.48f, 4.702f)
                close()
                moveTo(8.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.778f)
                lineToRelative(-5.0f, -5.0f)
                horizontalLineToRelative(-6.778f)
                close()
            }
        }
        .build()
        return _toiletPaperUnderSlash!!
    }

private var _toiletPaperUnderSlash: ImageVector? = null
