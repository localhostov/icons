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

public val Icons.Filled.RiskAlt: ImageVector
    get() {
        if (_riskAlt != null) {
            return _riskAlt!!
        }
        _riskAlt = Builder(name = "RiskAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.972f, 22.558f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-6.233f, -6.233f)
                curveToRelative(-1.725f, 1.412f, -3.927f, 2.262f, -6.324f, 2.262f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.398f, -0.85f, 4.6f, -2.262f, 6.324f)
                lineToRelative(6.233f, 6.233f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(10.0f, 3.714f)
                lineToRelative(-6.0f, 10.286f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _riskAlt!!
    }

private var _riskAlt: ImageVector? = null
