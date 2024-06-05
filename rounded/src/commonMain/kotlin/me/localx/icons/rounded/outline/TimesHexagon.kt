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

public val Icons.Outline.TimesHexagon: ImageVector
    get() {
        if (_timesHexagon != null) {
            return _timesHexagon!!
        }
        _timesHexagon = Builder(name = "TimesHexagon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.341f, 9.48f)
                lineToRelative(-3.501f, -6.0f)
                curveToRelative(-0.893f, -1.53f, -2.547f, -2.48f, -4.318f, -2.48f)
                horizontalLineToRelative(-7.071f)
                curveToRelative(-1.771f, 0.0f, -3.426f, 0.951f, -4.319f, 2.48f)
                lineTo(0.631f, 9.48f)
                curveToRelative(-0.906f, 1.554f, -0.906f, 3.485f, 0.0f, 5.039f)
                lineToRelative(3.501f, 6.0f)
                curveToRelative(0.893f, 1.53f, 2.547f, 2.48f, 4.318f, 2.48f)
                horizontalLineToRelative(7.071f)
                curveToRelative(1.771f, 0.0f, 3.426f, -0.951f, 4.319f, -2.48f)
                lineToRelative(3.5f, -6.0f)
                curveToRelative(0.906f, -1.554f, 0.906f, -3.485f, 0.0f, -5.039f)
                close()
                moveTo(21.612f, 13.511f)
                lineToRelative(-3.499f, 6.0f)
                curveToRelative(-0.536f, 0.918f, -1.529f, 1.488f, -2.592f, 1.488f)
                horizontalLineToRelative(-7.071f)
                curveToRelative(-1.062f, 0.0f, -2.056f, -0.57f, -2.591f, -1.488f)
                lineToRelative(-3.5f, -6.0f)
                curveToRelative(-0.544f, -0.933f, -0.544f, -2.091f, 0.0f, -3.023f)
                lineToRelative(3.499f, -6.0f)
                curveToRelative(0.536f, -0.918f, 1.529f, -1.488f, 2.592f, -1.488f)
                horizontalLineToRelative(7.071f)
                curveToRelative(1.062f, 0.0f, 2.056f, 0.57f, 2.591f, 1.488f)
                lineToRelative(3.5f, 6.0f)
                curveToRelative(0.544f, 0.933f, 0.544f, 2.091f, 0.0f, 3.023f)
                close()
                moveTo(15.707f, 9.706f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _timesHexagon!!
    }

private var _timesHexagon: ImageVector? = null
