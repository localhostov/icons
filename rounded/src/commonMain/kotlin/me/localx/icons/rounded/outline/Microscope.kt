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

public val Icons.Outline.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                curveToRelative(0.0f, -4.687f, -3.813f, -8.5f, -8.5f, -8.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                verticalLineToRelative(-1.172f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.172f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 16.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.133f)
                curveToRelative(3.974f, -0.711f, 7.0f, -4.192f, 7.0f, -8.367f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
