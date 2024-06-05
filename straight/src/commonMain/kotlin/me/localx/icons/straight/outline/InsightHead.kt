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

public val Icons.Outline.InsightHead: ImageVector
    get() {
        if (_insightHead != null) {
            return _insightHead!!
        }
        _insightHead = Builder(name = "InsightHead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.6f, 16.358f)
                lineToRelative(-1.486f, -1.486f)
                curveToRelative(0.694f, -1.447f, 0.998f, -3.06f, 0.848f, -4.708f)
                curveToRelative(-0.372f, -4.118f, -3.604f, -7.515f, -7.687f, -8.076f)
                curveToRelative(-3.313f, -0.452f, -6.479f, 0.867f, -8.475f, 3.531f)
                curveToRelative(-1.058f, 1.309f, -2.17f, 3.858f, -3.245f, 6.323f)
                lineToRelative(-0.464f, 1.059f)
                horizontalLineToRelative(1.99f)
                lineToRelative(0.68f, 5.132f)
                curveToRelative(0.065f, 0.495f, 0.491f, 0.868f, 0.991f, 0.868f)
                horizontalLineToRelative(4.247f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.758f)
                lineToRelative(1.242f, 1.242f)
                verticalLineToRelative(0.758f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.247f)
                curveToRelative(-1.5f, 0.0f, -2.778f, -1.121f, -2.974f, -2.606f)
                lineToRelative(-0.449f, -3.394f)
                lineTo(0.0f, 15.001f)
                verticalLineToRelative(-2.212f)
                lineToRelative(0.723f, -1.646f)
                curveToRelative(1.181f, -2.706f, 2.295f, -5.262f, 3.5f, -6.752f)
                curveTo(6.638f, 1.164f, 10.511f, -0.443f, 14.547f, 0.105f)
                curveToRelative(4.996f, 0.688f, 8.952f, 4.841f, 9.407f, 9.878f)
                curveToRelative(0.203f, 2.25f, -0.277f, 4.452f, -1.354f, 6.374f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 1.294f, -0.416f, 2.49f, -1.115f, 3.471f)
                lineToRelative(3.822f, 3.822f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.822f, -3.822f)
                curveToRelative(-0.981f, 0.699f, -2.177f, 1.115f, -3.471f, 1.115f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(13.0f, 15.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _insightHead!!
    }

private var _insightHead: ImageVector? = null
