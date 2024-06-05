package me.localx.icons.straight.bold

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

public val Icons.Bold.MegaphoneAnnouncementLeader: ImageVector
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
                moveToRelative(23.0f, 6.408f)
                verticalLineToRelative(3.592f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.0f, -0.5f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.425f)
                lineToRelative(1.303f, 3.016f)
                curveToRelative(0.195f, 0.438f, 0.155f, 0.94f, -0.106f, 1.342f)
                curveToRelative(-0.173f, 0.266f, -0.429f, 0.453f, -0.719f, 0.554f)
                lineToRelative(-3.654f, 2.088f)
                horizontalLineToRelative(-3.398f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(9.602f)
                lineToRelative(2.269f, -1.296f)
                lineToRelative(-1.703f, -3.907f)
                curveToRelative(-0.106f, -0.244f, -0.167f, -0.513f, -0.167f, -0.797f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.5f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.592f)
                curveToRelative(0.581f, 0.207f, 1.0f, 0.757f, 1.0f, 1.408f)
                reflectiveCurveToRelative(-0.419f, 1.201f, -1.0f, 1.408f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(2.0f, 3.791f, 2.0f, 6.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _megaphoneAnnouncementLeader!!
    }

private var _megaphoneAnnouncementLeader: ImageVector? = null
