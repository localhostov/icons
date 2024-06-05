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

public val Icons.Filled.MemberSearch: ImageVector
    get() {
        if (_memberSearch != null) {
            return _memberSearch!!
        }
        _memberSearch = Builder(name = "MemberSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(23.959f, 22.545f)
                lineToRelative(-2.792f, -2.792f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                lineToRelative(2.792f, 2.792f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, -1.075f, 0.25f, -2.09f, 0.683f, -3.0f)
                lineTo(5.0f, 14.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                lineTo(16.846f, 24.0f)
                verticalLineToRelative(-0.008f)
                curveToRelative(-3.794f, -0.083f, -6.846f, -3.178f, -6.846f, -6.992f)
                close()
            }
        }
        .build()
        return _memberSearch!!
    }

private var _memberSearch: ImageVector? = null
