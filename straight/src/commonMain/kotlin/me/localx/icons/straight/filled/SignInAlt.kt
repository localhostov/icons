package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.905f, 0.0f)
                horizontalLineTo(3.1f)
                arcTo(3.125f, 3.125f, 0.0f, false, false, 0.0f, 3.146f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.146f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 3.1f, 2.0f)
                horizontalLineToRelative(17.81f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 22.0f, 3.146f)
                verticalLineTo(20.854f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 20.905f, 22.0f)
                horizontalLineTo(3.1f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 2.0f, 20.854f)
                verticalLineTo(16.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(4.854f)
                arcTo(3.125f, 3.125f, 0.0f, false, false, 3.1f, 24.0f)
                horizontalLineToRelative(17.81f)
                arcTo(3.125f, 3.125f, 0.0f, false, false, 24.0f, 20.854f)
                verticalLineTo(3.146f)
                arcTo(3.125f, 3.125f, 0.0f, false, false, 20.905f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(17.086f)
                lineToRelative(-4.3f, 4.3f)
                lineTo(14.2f, 18.718f)
                lineToRelative(4.949f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                lineTo(14.2f, 5.282f)
                lineTo(12.783f, 6.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
