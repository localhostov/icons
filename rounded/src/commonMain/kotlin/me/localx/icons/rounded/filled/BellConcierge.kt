package me.localx.icons.rounded.filled

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

public val Icons.Filled.BellConcierge: ImageVector
    get() {
        if (_bellConcierge != null) {
            return _bellConcierge!!
        }
        _bellConcierge = Builder(name = "BellConcierge", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.402f, 18.0f)
                curveToRelative(1.433f, 0.0f, 2.598f, -1.166f, 2.598f, -2.598f)
                verticalLineToRelative(-1.402f)
                curveToRelative(0.0f, -6.279f, -4.851f, -11.438f, -11.0f, -11.949f)
                verticalLineToRelative(-1.051f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.051f)
                curveTo(4.851f, 2.562f, 0.0f, 7.721f, 0.0f, 14.0f)
                verticalLineToRelative(1.402f)
                curveToRelative(0.0f, 1.433f, 1.166f, 2.598f, 2.598f, 2.598f)
                horizontalLineToRelative(8.402f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.402f)
                close()
            }
        }
        .build()
        return _bellConcierge!!
    }

private var _bellConcierge: ImageVector? = null
