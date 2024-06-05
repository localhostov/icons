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

public val Icons.Bold.Boss: ImageVector
    get() {
        if (_boss != null) {
            return _boss!!
        }
        _boss = Builder(name = "Boss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(14.757f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.569f)
                curveToRelative(-0.495f, -3.94f, -3.859f, -7.0f, -7.931f, -7.0f)
                reflectiveCurveToRelative(-7.436f, 3.06f, -7.931f, 7.0f)
                lineTo(1.5f, 18.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.652f, 0.419f, 1.202f, 1.0f, 1.408f)
                verticalLineToRelative(1.592f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.592f)
                curveToRelative(0.581f, -0.207f, 1.0f, -0.756f, 1.0f, -1.408f)
                close()
                moveTo(16.899f, 18.0f)
                horizontalLineToRelative(-3.328f)
                lineToRelative(-0.669f, -2.336f)
                lineToRelative(0.88f, -1.32f)
                curveToRelative(1.575f, 0.605f, 2.774f, 1.972f, 3.117f, 3.657f)
                close()
                moveTo(10.218f, 14.343f)
                lineToRelative(0.88f, 1.32f)
                lineToRelative(-0.669f, 2.336f)
                horizontalLineToRelative(-3.328f)
                curveToRelative(0.344f, -1.685f, 1.543f, -3.052f, 3.117f, -3.657f)
                close()
            }
        }
        .build()
        return _boss!!
    }

private var _boss: ImageVector? = null
