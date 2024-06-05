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

public val Icons.Filled.ListMusic: ImageVector
    get() {
        if (_listMusic != null) {
            return _listMusic!!
        }
        _listMusic = Builder(name = "ListMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(11.761f)
                curveToRelative(-0.952f, -0.787f, -2.172f, -1.261f, -3.5f, -1.261f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(13.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.769f, 12.0f)
                curveToRelative(-0.883f, 0.508f, -1.649f, 1.19f, -2.259f, 2.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.769f)
                close()
            }
        }
        .build()
        return _listMusic!!
    }

private var _listMusic: ImageVector? = null
