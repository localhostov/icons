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

public val Icons.Outline.Beacon: ImageVector
    get() {
        if (_beacon != null) {
            return _beacon!!
        }
        _beacon = Builder(name = "Beacon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 5.38f, 18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                reflectiveCurveTo(6.49f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.49f, 10.0f, 10.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _beacon!!
    }

private var _beacon: ImageVector? = null
