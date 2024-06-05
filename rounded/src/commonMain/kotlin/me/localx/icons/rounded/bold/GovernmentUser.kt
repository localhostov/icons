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

public val Icons.Bold.GovernmentUser: ImageVector
    get() {
        if (_governmentUser != null) {
            return _governmentUser!!
        }
        _governmentUser = Builder(name = "GovernmentUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(12.757f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(10.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(23.0f, 2.908f)
                verticalLineToRelative(5.439f)
                curveToRelative(0.0f, 0.623f, -0.791f, 0.89f, -1.169f, 0.395f)
                lineToRelative(-1.331f, -1.743f)
                lineToRelative(-1.331f, 1.743f)
                curveToRelative(-0.378f, 0.495f, -1.169f, 0.228f, -1.169f, -0.395f)
                lineTo(18.0f, 2.908f)
                curveToRelative(-0.581f, -0.207f, -1.0f, -0.756f, -1.0f, -1.408f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.652f, -0.419f, 1.201f, -1.0f, 1.408f)
                close()
                moveTo(18.5f, 18.0f)
                horizontalLineToRelative(-0.569f)
                curveToRelative(-0.495f, -3.94f, -3.859f, -7.0f, -7.931f, -7.0f)
                reflectiveCurveToRelative(-7.436f, 3.06f, -7.931f, 7.0f)
                horizontalLineToRelative(-0.569f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.652f, 0.419f, 1.201f, 1.0f, 1.408f)
                verticalLineToRelative(1.592f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.592f)
                curveToRelative(0.581f, -0.207f, 1.0f, -0.756f, 1.0f, -1.408f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.899f, 18.0f)
                horizontalLineToRelative(-3.433f)
                lineToRelative(-0.607f, -2.272f)
                lineToRelative(0.923f, -1.385f)
                curveToRelative(1.575f, 0.605f, 2.774f, 1.972f, 3.117f, 3.657f)
                close()
                moveTo(8.218f, 14.343f)
                lineToRelative(0.923f, 1.385f)
                lineToRelative(-0.607f, 2.272f)
                horizontalLineToRelative(-3.433f)
                curveToRelative(0.344f, -1.685f, 1.543f, -3.052f, 3.117f, -3.657f)
                close()
            }
        }
        .build()
        return _governmentUser!!
    }

private var _governmentUser: ImageVector? = null
