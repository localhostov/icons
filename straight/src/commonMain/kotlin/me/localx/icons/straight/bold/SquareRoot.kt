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

public val Icons.Bold.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.123f, 22.0f)
                horizontalLineToRelative(-3.139f)
                lineToRelative(-3.874f, -9.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.464f, -0.314f)
                horizontalLineToRelative(-1.646f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.646f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, true, 3.254f, 2.2f)
                lineToRelative(2.46f, 6.161f)
                lineToRelative(3.779f, -12.849f)
                arcToRelative(3.519f, 3.519f, 0.0f, false, true, 3.361f, -2.512f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.479f, 0.359f)
                close()
                moveTo(20.761f, 17.0f)
                lineTo(24.0f, 12.0f)
                horizontalLineToRelative(-3.522f)
                lineToRelative(-1.478f, 2.281f)
                lineToRelative(-1.478f, -2.281f)
                horizontalLineToRelative(-3.522f)
                lineToRelative(3.239f, 5.0f)
                lineToRelative(-3.239f, 5.0f)
                horizontalLineToRelative(3.522f)
                lineToRelative(1.478f, -2.281f)
                lineToRelative(1.478f, 2.281f)
                horizontalLineToRelative(3.522f)
                close()
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
