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

public val Icons.Bold.VenusDouble: ImageVector
    get() {
        if (_venusDouble != null) {
            return _venusDouble!!
        }
        _venusDouble = Builder(name = "VenusDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                arcTo(7.486f, 7.486f, 0.0f, false, false, 12.005f, 1.51f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 6.0f, 14.849f)
                lineTo(6.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 14.844f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, 3.005f, -1.354f)
                arcTo(7.463f, 7.463f, 0.0f, false, false, 15.0f, 14.849f)
                lineTo(15.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 14.849f)
                arcTo(7.513f, 7.513f, 0.0f, false, false, 24.0f, 7.5f)
                close()
                moveTo(3.0f, 7.5f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, true, 7.0f, -3.724f)
                arcToRelative(7.441f, 7.441f, 0.0f, false, false, 0.0f, 7.448f)
                arcTo(4.479f, 4.479f, 0.0f, false, true, 3.0f, 7.5f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 16.5f, 12.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _venusDouble!!
    }

private var _venusDouble: ImageVector? = null
