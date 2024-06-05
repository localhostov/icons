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

public val Icons.Filled.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.023f, 4.171f)
                curveToRelative(0.37f, 0.599f, 0.87f, 2.265f, 0.977f, 4.829f)
                horizontalLineToRelative(-1.954f)
                curveToRelative(0.107f, -2.564f, 0.607f, -4.23f, 0.977f, -4.829f)
                close()
                moveTo(13.0f, 11.0f)
                curveToRelative(-0.107f, 2.564f, -0.607f, 4.23f, -0.977f, 4.829f)
                curveToRelative(-0.37f, -0.599f, -0.87f, -2.265f, -0.977f, -4.829f)
                horizontalLineToRelative(1.954f)
                close()
                moveTo(9.748f, 4.463f)
                curveToRelative(-0.485f, 1.519f, -0.648f, 3.384f, -0.7f, 4.537f)
                horizontalLineToRelative(-2.935f)
                curveToRelative(0.348f, -2.062f, 1.755f, -3.759f, 3.635f, -4.537f)
                close()
                moveTo(9.048f, 11.0f)
                curveToRelative(0.052f, 1.153f, 0.215f, 3.018f, 0.7f, 4.537f)
                curveToRelative(-1.88f, -0.778f, -3.287f, -2.475f, -3.635f, -4.537f)
                horizontalLineToRelative(2.935f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.298f, 15.537f)
                curveToRelative(0.485f, -1.519f, 0.648f, -3.384f, 0.7f, -4.537f)
                horizontalLineToRelative(2.935f)
                curveToRelative(-0.348f, 2.062f, -1.755f, 3.759f, -3.635f, 4.537f)
                close()
                moveTo(14.998f, 9.0f)
                curveToRelative(-0.052f, -1.153f, -0.215f, -3.018f, -0.7f, -4.537f)
                curveToRelative(1.88f, 0.778f, 3.287f, 2.475f, 3.635f, 4.537f)
                horizontalLineToRelative(-2.935f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
