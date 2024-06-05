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

public val Icons.Bold.BowlScoop: ImageVector
    get() {
        if (_bowlScoop != null) {
            return _bowlScoop!!
        }
        _bowlScoop = Builder(name = "BowlScoop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                lineToRelative(-1.361f, 3.5f)
                curveToRelative(-1.488f, 2.483f, -4.025f, 2.55f, -6.842f, 2.515f)
                curveToRelative(-0.287f, -0.004f, -1.354f, -0.008f, -2.296f, -0.011f)
                verticalLineToRelative(1.996f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.996f)
                curveToRelative(-0.942f, 0.003f, -2.01f, 0.008f, -2.296f, 0.011f)
                curveToRelative(-2.817f, 0.035f, -5.354f, -0.033f, -6.842f, -2.515f)
                lineToRelative(-1.361f, -3.5f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bowlScoop!!
    }

private var _bowlScoop: ImageVector? = null
