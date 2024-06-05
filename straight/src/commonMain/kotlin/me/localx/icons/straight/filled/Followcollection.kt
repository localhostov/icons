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

public val Icons.Filled.Followcollection: ImageVector
    get() {
        if (_followcollection != null) {
            return _followcollection!!
        }
        _followcollection = Builder(name = "Followcollection", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.97f)
                curveToRelative(0.0f, 3.11f, -5.5f, 7.44f, -5.5f, 7.44f)
                curveToRelative(0.0f, 0.0f, -5.5f, -4.33f, -5.5f, -7.44f)
                curveToRelative(0.0f, -1.64f, 1.23f, -2.97f, 2.75f, -2.97f)
                reflectiveCurveToRelative(2.75f, 1.29f, 2.75f, 2.44f)
                curveToRelative(0.0f, -1.18f, 1.23f, -2.44f, 2.75f, -2.44f)
                reflectiveCurveToRelative(2.75f, 1.33f, 2.75f, 2.97f)
                close()
                moveTo(11.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(24.0f, 16.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(11.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _followcollection!!
    }

private var _followcollection: ImageVector? = null
