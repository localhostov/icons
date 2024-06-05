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

public val Icons.Bold.Blinds: ImageVector
    get() {
        if (_blinds != null) {
            return _blinds!!
        }
        _blinds = Builder(name = "Blinds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.338f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 23.0f)
                lineTo(15.605f, 23.0f)
                curveToRelative(-0.384f, -0.751f, -0.605f, -1.599f, -0.605f, -2.5f)
                curveToRelative(0.0f, -0.169f, 0.013f, -0.335f, 0.028f, -0.5f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.606f, 18.0f)
                curveToRelative(0.344f, -0.672f, 0.817f, -1.266f, 1.394f, -1.743f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.838f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.393f, -0.819f, -2.599f, -2.0f, -3.162f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(14.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _blinds!!
    }

private var _blinds: ImageVector? = null
