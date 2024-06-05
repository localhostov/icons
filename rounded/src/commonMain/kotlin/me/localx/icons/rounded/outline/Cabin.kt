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

public val Icons.Outline.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 6.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 9.724f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(15.0f, 13.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 9.724f)
                curveToRelative(0.0f, -1.664f, 0.824f, -3.214f, 2.203f, -4.146f)
                lineTo(9.204f, 0.855f)
                curveToRelative(1.698f, -1.146f, 3.894f, -1.146f, 5.593f, 0.0f)
                lineToRelative(5.203f, 3.511f)
                lineTo(20.0f, 2.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.724f)
                curveToRelative(1.257f, 0.943f, 2.0f, 2.42f, 2.0f, 4.0f)
                close()
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.172f, 20.0f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.172f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.351f, 0.061f, -0.687f, 0.172f, -1.0f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(-0.276f)
                curveToRelative(0.0f, -0.999f, -0.494f, -1.929f, -1.322f, -2.487f)
                lineTo(13.678f, 2.514f)
                curveToRelative(-1.02f, -0.689f, -2.336f, -0.689f, -3.356f, 0.0f)
                lineTo(3.322f, 7.236f)
                curveToRelative(-0.828f, 0.559f, -1.322f, 1.488f, -1.322f, 2.487f)
                verticalLineToRelative(0.276f)
                lineTo(22.0f, 9.999f)
                close()
                moveTo(16.828f, 12.0f)
                curveToRelative(0.111f, 0.313f, 0.172f, 0.649f, 0.172f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.172f)
                close()
                moveTo(21.828f, 20.0f)
                horizontalLineToRelative(-4.828f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, -0.836f, 2.828f, -2.0f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
