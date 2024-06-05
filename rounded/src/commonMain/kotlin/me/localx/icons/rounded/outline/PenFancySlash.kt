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

public val Icons.Outline.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.357f, 17.3f)
                lineToRelative(-0.646f, 2.056f)
                curveToRelative(-0.452f, 1.438f, -1.645f, 2.545f, -3.112f, 2.89f)
                lineToRelative(-7.37f, 1.728f)
                curveToRelative(-0.076f, 0.018f, -0.152f, 0.026f, -0.229f, 0.026f)
                curveToRelative(-0.262f, 0.0f, -0.518f, -0.103f, -0.707f, -0.293f)
                curveToRelative(-0.245f, -0.245f, -0.346f, -0.598f, -0.267f, -0.935f)
                lineToRelative(1.728f, -7.37f)
                curveToRelative(0.345f, -1.468f, 1.452f, -2.661f, 2.891f, -3.113f)
                lineToRelative(2.056f, -0.646f)
                curveToRelative(0.528f, -0.167f, 1.088f, 0.128f, 1.254f, 0.654f)
                curveToRelative(0.165f, 0.527f, -0.127f, 1.088f, -0.654f, 1.254f)
                lineToRelative(-2.056f, 0.646f)
                curveToRelative(-0.768f, 0.241f, -1.359f, 0.878f, -1.543f, 1.662f)
                lineToRelative(-0.926f, 3.952f)
                lineToRelative(2.518f, -2.518f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.519f, 2.518f)
                lineToRelative(3.953f, -0.927f)
                curveToRelative(0.783f, -0.184f, 1.42f, -0.775f, 1.661f, -1.542f)
                lineToRelative(0.646f, -2.056f)
                curveToRelative(0.166f, -0.527f, 0.722f, -0.822f, 1.254f, -0.654f)
                curveToRelative(0.527f, 0.166f, 0.819f, 0.727f, 0.654f, 1.254f)
                close()
                moveTo(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(8.879f, 8.879f)
                lineTo(18.879f, 0.879f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-8.293f, 8.292f)
                lineToRelative(8.879f, 8.879f)
                close()
                moveTo(12.0f, 10.586f)
                lineToRelative(1.414f, 1.414f)
                lineTo(21.707f, 3.707f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-8.293f, 8.293f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null
