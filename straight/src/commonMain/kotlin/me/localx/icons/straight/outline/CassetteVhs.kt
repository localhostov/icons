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

public val Icons.Outline.CassetteVhs: ImageVector
    get() {
        if (_cassetteVhs != null) {
            return _cassetteVhs!!
        }
        _cassetteVhs = Builder(name = "CassetteVhs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(18.45f, 9.0f)
                lineTo(5.55f, 9.0f)
                lineToRelative(-0.3f, 0.34f)
                curveToRelative(-0.05f, 0.06f, -1.25f, 1.43f, -1.25f, 3.66f)
                reflectiveCurveToRelative(1.2f, 3.61f, 1.25f, 3.66f)
                lineToRelative(0.3f, 0.34f)
                horizontalLineToRelative(12.9f)
                lineToRelative(0.3f, -0.34f)
                curveToRelative(0.05f, -0.06f, 1.25f, -1.43f, 1.25f, -3.66f)
                reflectiveCurveToRelative(-1.2f, -3.61f, -1.25f, -3.66f)
                lineToRelative(-0.3f, -0.34f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 13.0f)
                curveToRelative(0.0f, -0.93f, 0.3f, -1.62f, 0.52f, -2.0f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.22f, -0.38f, -0.52f, -1.07f, -0.52f, -2.0f)
                close()
                moveTo(17.48f, 15.0f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.22f, 0.38f, 0.52f, 1.07f, 0.52f, 2.0f)
                reflectiveCurveToRelative(-0.3f, 1.62f, -0.52f, 2.0f)
                close()
            }
        }
        .build()
        return _cassetteVhs!!
    }

private var _cassetteVhs: ImageVector? = null
