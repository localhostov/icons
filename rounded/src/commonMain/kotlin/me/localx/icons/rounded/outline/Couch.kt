package me.localx.icons.rounded.outline

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

public val Icons.Outline.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.172f)
                verticalLineToRelative(-2.172f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(2.172f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.632f, 0.786f, 3.084f, 2.0f, 3.997f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.002f, 0.0f, 0.003f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.101f)
                curveToRelative(0.323f, 0.066f, 0.658f, 0.101f, 1.0f, 0.101f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.035f, 1.0f, -0.101f)
                verticalLineToRelative(1.101f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.0f, -0.002f, 0.0f, -0.003f)
                curveToRelative(1.214f, -0.913f, 2.0f, -2.365f, 2.0f, -3.997f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(2.172f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                verticalLineToRelative(-2.172f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
