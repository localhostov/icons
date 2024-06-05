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

public val Icons.Filled.PeoplePoll: ImageVector
    get() {
        if (_peoplePoll != null) {
            return _peoplePoll!!
        }
        _peoplePoll = Builder(name = "PeoplePoll", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 15.0f)
                lineTo(12.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 20.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.5f, 9.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(12.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(1.0f, 3.0f)
                curveTo(1.0f, 1.346f, 2.346f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveTo(1.0f, 4.654f, 1.0f, 3.0f)
                close()
                moveTo(7.937f, 9.649f)
                curveToRelative(0.115f, 0.307f, 0.072f, 0.65f, -0.115f, 0.92f)
                curveToRelative(-0.187f, 0.27f, -0.494f, 0.431f, -0.822f, 0.431f)
                lineTo(1.0f, 11.0f)
                curveToRelative(-0.328f, 0.0f, -0.635f, -0.161f, -0.822f, -0.431f)
                curveToRelative(-0.187f, -0.27f, -0.229f, -0.613f, -0.115f, -0.92f)
                curveToRelative(0.594f, -1.585f, 2.176f, -2.649f, 3.937f, -2.649f)
                reflectiveCurveToRelative(3.343f, 1.064f, 3.937f, 2.649f)
                close()
                moveTo(4.0f, 19.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(7.937f, 22.649f)
                curveToRelative(0.115f, 0.307f, 0.072f, 0.65f, -0.115f, 0.92f)
                curveToRelative(-0.187f, 0.27f, -0.494f, 0.431f, -0.822f, 0.431f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.328f, 0.0f, -0.635f, -0.161f, -0.822f, -0.431f)
                curveToRelative(-0.187f, -0.27f, -0.229f, -0.613f, -0.115f, -0.92f)
                curveToRelative(0.594f, -1.585f, 2.176f, -2.649f, 3.937f, -2.649f)
                reflectiveCurveToRelative(3.343f, 1.064f, 3.937f, 2.649f)
                close()
            }
        }
        .build()
        return _peoplePoll!!
    }

private var _peoplePoll: ImageVector? = null
