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

public val Icons.Outline.ListMusic: ImageVector
    get() {
        if (_listMusic != null) {
            return _listMusic!!
        }
        _listMusic = Builder(name = "ListMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.467f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.468f, -5.5f, 5.5f, -5.5f)
                curveToRelative(1.328f, 0.0f, 2.548f, 0.474f, 3.5f, 1.261f)
                lineTo(17.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(17.0f, 18.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(9.756f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.608f, -0.809f, 1.376f, -1.492f, 2.256f, -2.0f)
                close()
            }
        }
        .build()
        return _listMusic!!
    }

private var _listMusic: ImageVector? = null
