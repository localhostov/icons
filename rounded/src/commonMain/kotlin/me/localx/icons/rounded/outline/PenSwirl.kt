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

public val Icons.Outline.PenSwirl: ImageVector
    get() {
        if (_penSwirl != null) {
            return _penSwirl!!
        }
        _penSwirl = Builder(name = "PenSwirl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.684f, 23.485f)
                curveToRelative(-0.183f, 0.329f, -0.523f, 0.515f, -0.875f, 0.515f)
                curveToRelative(-0.164f, 0.0f, -0.331f, -0.04f, -0.485f, -0.126f)
                curveTo(2.669f, 21.288f, 0.0f, 16.96f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(0.731f, 0.0f, 1.465f, 0.066f, 2.181f, 0.198f)
                curveToRelative(0.543f, 0.1f, 0.903f, 0.621f, 0.803f, 1.164f)
                curveToRelative(-0.1f, 0.544f, -0.622f, 0.905f, -1.164f, 0.803f)
                curveToRelative(-0.597f, -0.109f, -1.208f, -0.165f, -1.819f, -0.165f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.213f, 2.294f, 7.903f, 6.295f, 10.126f)
                curveToRelative(0.482f, 0.269f, 0.657f, 0.877f, 0.388f, 1.359f)
                close()
                moveTo(23.803f, 9.819f)
                curveToRelative(-0.099f, -0.543f, -0.618f, -0.907f, -1.164f, -0.803f)
                curveToRelative(-0.543f, 0.1f, -0.903f, 0.621f, -0.803f, 1.164f)
                curveToRelative(0.109f, 0.595f, 0.165f, 1.207f, 0.165f, 1.819f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.733f, -0.066f, -1.467f, -0.198f, -2.181f)
                close()
                moveTo(13.173f, 6.586f)
                lineTo(18.879f, 0.879f)
                curveToRelative(1.133f, -1.133f, 3.109f, -1.133f, 4.243f, 0.0f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.072f, 0.0f, 4.242f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.755f, 0.756f, -1.76f, 1.172f, -2.828f, 1.172f)
                horizontalLineToRelative(-1.586f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -1.068f, 0.417f, -2.073f, 1.172f, -2.828f)
                close()
                moveTo(14.001f, 10.0f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.526f, 0.0f, 1.042f, -0.214f, 1.414f, -0.586f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                curveToRelative(-0.378f, -0.379f, -1.037f, -0.379f, -1.414f, 0.0f)
                lineToRelative(-5.708f, 5.707f)
                curveToRelative(-0.378f, 0.378f, -0.586f, 0.88f, -0.586f, 1.414f)
                verticalLineToRelative(0.586f)
                close()
            }
        }
        .build()
        return _penSwirl!!
    }

private var _penSwirl: ImageVector? = null
