package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(22.483f, 11.384f)
                curveTo(22.177f, 5.755f, 16.978f, 1.0f, 11.131f, 1.0f)
                horizontalLineToRelative(-0.123f)
                arcTo(2.437f, 2.437f, 0.0f, false, false, 9.046f, 0.0f)
                lineTo(7.363f, 0.0f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 3.0f, 4.364f)
                lineTo(3.0f, 19.636f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 7.363f, 24.0f)
                lineTo(9.046f, 24.0f)
                arcToRelative(2.437f, 2.437f, 0.0f, false, false, 1.962f, -1.0f)
                horizontalLineToRelative(0.446f)
                arcTo(11.118f, 11.118f, 0.0f, false, false, 19.5f, 19.549f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 22.483f, 11.384f)
                close()
                moveTo(17.317f, 17.484f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.454f, 20.0f)
                lineTo(10.0f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.415f, 1.0f)
                lineTo(7.363f, 21.0f)
                arcTo(1.365f, 1.365f, 0.0f, false, true, 6.0f, 19.636f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 13.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(6.0f, 10.5f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 4.364f)
                arcTo(1.365f, 1.365f, 0.0f, false, true, 7.363f, 3.0f)
                lineTo(8.585f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 4.0f)
                horizontalLineToRelative(1.131f)
                curveToRelative(4.232f, 0.0f, 8.138f, 3.527f, 8.356f, 7.547f)
                arcTo(7.921f, 7.921f, 0.0f, false, true, 17.317f, 17.486f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.947f, 0.992f)
                arcTo(4.106f, 4.106f, 0.0f, false, false, 15.981f, 12.4f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
