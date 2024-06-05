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

public val Icons.Bold.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.264f, 9.236f)
                curveToRelative(-0.543f, -0.542f, -1.292f, -0.807f, -2.051f, -0.72f)
                curveToRelative(-1.574f, 0.176f, -3.047f, 0.649f, -4.368f, 1.359f)
                curveToRelative(-0.332f, -2.691f, -1.197f, -4.961f, -2.584f, -6.768f)
                curveToRelative(-0.54f, -0.703f, -1.364f, -1.106f, -2.261f, -1.106f)
                reflectiveCurveToRelative(-1.721f, 0.403f, -2.261f, 1.107f)
                curveToRelative(-1.432f, 1.866f, -2.35f, 4.227f, -2.653f, 6.731f)
                curveToRelative(-1.303f, -0.689f, -2.753f, -1.149f, -4.299f, -1.322f)
                curveToRelative(-0.758f, -0.085f, -1.509f, 0.177f, -2.052f, 0.72f)
                reflectiveCurveTo(-0.07f, 10.527f, 0.016f, 11.287f)
                curveToRelative(0.683f, 6.107f, 5.835f, 10.713f, 11.984f, 10.713f)
                reflectiveCurveToRelative(11.301f, -4.605f, 11.984f, -10.712f)
                curveToRelative(0.085f, -0.761f, -0.177f, -1.509f, -0.72f, -2.052f)
                close()
                moveTo(12.0f, 5.092f)
                curveToRelative(1.274f, 1.741f, 1.928f, 4.009f, 1.994f, 6.912f)
                curveToRelative(-0.782f, 0.789f, -1.454f, 1.684f, -1.994f, 2.661f)
                curveToRelative(-0.546f, -0.988f, -1.228f, -1.892f, -2.021f, -2.688f)
                curveToRelative(-0.065f, -2.551f, 0.661f, -5.029f, 2.021f, -6.885f)
                close()
                moveTo(3.092f, 11.592f)
                curveToRelative(3.655f, 0.685f, 6.556f, 3.643f, 7.25f, 7.25f)
                curveToRelative(-3.606f, -0.694f, -6.564f, -3.594f, -7.25f, -7.25f)
                close()
                moveTo(13.658f, 18.842f)
                curveToRelative(0.694f, -3.606f, 3.594f, -6.564f, 7.25f, -7.25f)
                curveToRelative(-0.685f, 3.655f, -3.643f, 6.556f, -7.25f, 7.25f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
