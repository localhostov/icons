package me.localx.icons.rounded.filled

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

public val Icons.Filled.Protractor: ImageVector
    get() {
        if (_protractor != null) {
            return _protractor!!
        }
        _protractor = Builder(name = "Protractor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.977f, 11.264f)
                curveToRelative(-0.364f, -5.54f, -5.503f, -10.223f, -11.246f, -10.264f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.731f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.731f, -1.0f)
                horizontalLineToRelative(0.269f)
                arcToRelative(11.041f, 11.041f, 0.0f, false, false, 8.028f, -3.481f)
                arcToRelative(10.915f, 10.915f, 0.0f, false, false, 2.949f, -8.255f)
                close()
                moveTo(10.947f, 15.989f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.947f, -0.989f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.981f, 4.393f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.034f, 3.596f)
                close()
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
