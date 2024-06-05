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

public val Icons.Bold.CassetteVhs: ImageVector
    get() {
        if (_cassetteVhs != null) {
            return _cassetteVhs!!
        }
        _cassetteVhs = Builder(name = "CassetteVhs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 18.0f)
                lineTo(3.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                verticalLineToRelative(10.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 10.0f)
                reflectiveCurveToRelative(1.0f, 1.12f, 1.0f, 3.0f)
                reflectiveCurveToRelative(-1.0f, 3.0f, -1.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(-1.0f, -1.12f, -1.0f, -3.0f)
                reflectiveCurveToRelative(1.0f, -3.0f, 1.0f, -3.0f)
                close()
            }
        }
        .build()
        return _cassetteVhs!!
    }

private var _cassetteVhs: ImageVector? = null
