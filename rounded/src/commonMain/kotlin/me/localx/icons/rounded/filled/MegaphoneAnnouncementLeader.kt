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

public val Icons.Filled.MegaphoneAnnouncementLeader: ImageVector
    get() {
        if (_megaphoneAnnouncementLeader != null) {
            return _megaphoneAnnouncementLeader!!
        }
        _megaphoneAnnouncementLeader = Builder(name = "MegaphoneAnnouncementLeader", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 6.0f)
                curveTo(1.0f, 3.243f, 3.243f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveTo(1.0f, 8.757f, 1.0f, 6.0f)
                close()
                moveTo(23.0f, 3.592f)
                lineTo(23.0f, 1.0f)
                curveToRelative(0.0f, -0.265f, -0.105f, -0.52f, -0.293f, -0.707f)
                reflectiveCurveToRelative(-0.442f, -0.293f, -0.707f, -0.293f)
                curveToRelative(-0.446f, 0.0f, -0.972f, 0.295f, -1.095f, 0.724f)
                curveToRelative(-0.236f, 0.823f, -0.913f, 1.276f, -1.905f, 1.276f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.695f, 0.247f, 1.327f, 0.645f, 1.836f)
                lineToRelative(1.773f, 4.112f)
                lineToRelative(-1.674f, 1.745f)
                curveToRelative(-0.188f, 0.195f, -0.451f, 0.308f, -0.722f, 0.308f)
                lineTo(6.0f, 13.001f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(4.184f, -1.237f)
                curveToRelative(0.375f, -0.157f, 0.718f, -0.389f, 1.003f, -0.686f)
                curveToRelative(0.0f, 0.0f, 2.584f, -2.719f, 2.584f, -2.719f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.001f, 0.0f, -0.001f)
                curveToRelative(0.152f, -0.193f, 0.233f, -0.422f, 0.223f, -0.654f)
                curveToRelative(0.019f, -0.231f, -0.02f, -0.466f, -0.117f, -0.686f)
                lineToRelative(-0.79f, -2.016f)
                horizontalLineToRelative(0.912f)
                curveToRelative(0.992f, 0.0f, 1.669f, 0.453f, 1.905f, 1.276f)
                curveToRelative(0.123f, 0.429f, 0.648f, 0.724f, 1.094f, 0.724f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.592f)
                curveToRelative(0.581f, -0.207f, 1.001f, -0.757f, 1.001f, -1.408f)
                reflectiveCurveToRelative(-0.419f, -1.201f, -1.0f, -1.408f)
                close()
            }
        }
        .build()
        return _megaphoneAnnouncementLeader!!
    }

private var _megaphoneAnnouncementLeader: ImageVector? = null
