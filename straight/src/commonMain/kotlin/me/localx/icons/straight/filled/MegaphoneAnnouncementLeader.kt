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
                moveToRelative(24.0f, 5.0f)
                curveToRelative(0.0f, -0.651f, -0.419f, -1.201f, -1.0f, -1.408f)
                verticalLineTo(0.0f)
                reflectiveCurveToRelative(-1.887f, 0.0f, -1.887f, 0.0f)
                lineToRelative(-0.208f, 0.724f)
                curveToRelative(-0.236f, 0.823f, -0.913f, 1.276f, -1.905f, 1.276f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.741f, 0.409f, 1.381f, 1.008f, 1.727f)
                lineToRelative(1.406f, 3.225f)
                lineToRelative(-1.966f, 2.049f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(4.301f, -1.0f)
                reflectiveCurveToRelative(3.453f, -3.616f, 3.47f, -3.642f)
                curveToRelative(0.261f, -0.402f, 0.301f, -0.903f, 0.106f, -1.342f)
                lineToRelative(-0.871f, -2.016f)
                horizontalLineToRelative(0.993f)
                curveToRelative(0.992f, 0.0f, 1.669f, 0.453f, 1.905f, 1.276f)
                lineToRelative(0.208f, 0.724f)
                horizontalLineToRelative(1.886f)
                verticalLineToRelative(-3.592f)
                curveToRelative(0.581f, -0.207f, 1.001f, -0.757f, 1.001f, -1.408f)
                close()
                moveTo(7.0f, 11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(9.757f, 1.0f, 7.0f, 1.0f)
                reflectiveCurveTo(2.0f, 3.243f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _megaphoneAnnouncementLeader!!
    }

private var _megaphoneAnnouncementLeader: ImageVector? = null
