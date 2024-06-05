package me.localx.icons.straight.filled

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

public val Icons.Filled.FrenchFries: ImageVector
    get() {
        if (_frenchFries != null) {
            return _frenchFries!!
        }
        _frenchFries = Builder(name = "FrenchFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.081f, 24.0f)
                horizontalLineTo(4.938f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.951f, -2.463f)
                lineTo(0.0f, 12.0f)
                horizontalLineTo(24.0f)
                lineToRelative(-1.967f, 9.537f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.081f, 24.0f)
                close()
                moveTo(2.017f, 10.0f)
                horizontalLineToRelative(2.1f)
                lineTo(3.282f, 7.39f)
                lineToRelative(2.405f, -0.764f)
                lineTo(6.263f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.819f)
                lineToRelative(0.571f, -3.349f)
                lineToRelative(2.328f, 0.739f)
                lineTo(19.883f, 10.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.251f, -3.91f)
                lineToRelative(-4.5f, -1.43f)
                lineTo(19.4f, 0.712f)
                lineTo(14.75f, 0.0f)
                lineTo(14.4f, 2.0f)
                horizontalLineTo(9.507f)
                lineTo(9.154f, 0.0f)
                lineTo(4.692f, 0.8f)
                lineToRelative(0.655f, 3.839f)
                lineTo(0.766f, 6.09f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
