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

public val Icons.Bold.Protractor: ImageVector
    get() {
        if (_protractor != null) {
            return _protractor!!
        }
        _protractor = Builder(name = "Protractor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.973f, 11.216f)
                arcTo(11.167f, 11.167f, 0.0f, false, false, 12.0f, 1.077f)
                lineTo(12.0f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 3.5f)
                verticalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 24.0f)
                lineTo(12.0f, 24.0f)
                lineTo(12.0f, 22.961f)
                arcToRelative(10.933f, 10.933f, 0.0f, false, false, 7.032f, -3.436f)
                arcTo(11.087f, 11.087f, 0.0f, false, false, 21.973f, 11.216f)
                close()
                moveTo(16.838f, 17.479f)
                arcTo(7.793f, 7.793f, 0.0f, false, true, 11.088f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(5.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 13.5f)
                lineTo(7.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 10.5f)
                lineTo(5.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(1.663f)
                arcToRelative(8.208f, 8.208f, 0.0f, false, true, 8.317f, 7.426f)
                arcTo(7.968f, 7.968f, 0.0f, false, true, 16.838f, 17.479f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(4.167f, 4.167f, 0.0f, false, true, -4.167f, 4.167f)
                lineTo(10.0f, 16.167f)
                lineTo(10.0f, 7.833f)
                horizontalLineToRelative(0.833f)
                arcTo(4.167f, 4.167f, 0.0f, false, true, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
