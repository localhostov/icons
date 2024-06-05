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

public val Icons.Bold.PesetaSign: ImageVector
    get() {
        if (_pesetaSign != null) {
            return _pesetaSign!!
        }
        _pesetaSign = Builder(name = "PesetaSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 7.5f)
                horizontalLineToRelative(-1.63f)
                curveTo(20.16f, 3.25f, 16.45f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(5.47f, 0.0f, 3.0f, 2.47f, 3.0f, 5.5f)
                verticalLineToRelative(2.0f)
                lineTo(1.5f, 7.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(4.45f, 0.0f, 8.16f, -3.25f, 8.87f, -7.5f)
                horizontalLineToRelative(1.63f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.79f, 0.0f, 5.14f, 1.91f, 5.81f, 4.5f)
                lineTo(6.0f, 7.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(11.81f)
                curveToRelative(-0.67f, 2.59f, -3.02f, 4.5f, -5.81f, 4.5f)
                close()
            }
        }
        .build()
        return _pesetaSign!!
    }

private var _pesetaSign: ImageVector? = null
