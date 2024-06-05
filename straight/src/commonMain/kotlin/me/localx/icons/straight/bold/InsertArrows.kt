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

public val Icons.Bold.InsertArrows: ImageVector
    get() {
        if (_insertArrows != null) {
            return _insertArrows!!
        }
        _insertArrows = Builder(name = "InsertArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.237f)
                curveToRelative(0.0f, -0.123f, 0.046f, -0.241f, 0.127f, -0.333f)
                lineToRelative(5.746f, -6.431f)
                lineTo(21.637f, 0.0f)
                lineToRelative(-5.747f, 6.432f)
                curveToRelative(-0.574f, 0.643f, -0.89f, 1.471f, -0.89f, 2.331f)
                verticalLineToRelative(6.237f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.237f)
                curveToRelative(0.0f, -0.862f, -0.316f, -1.69f, -0.891f, -2.332f)
                lineTo(2.363f, 0.0f)
                lineTo(0.127f, 2.0f)
                lineToRelative(5.746f, 6.431f)
                curveToRelative(0.082f, 0.091f, 0.127f, 0.209f, 0.127f, 0.333f)
                verticalLineToRelative(6.237f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 12.001f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 21.0f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-5.432f)
                lineToRelative(3.782f, 3.639f)
                curveToRelative(0.397f, 0.391f, 1.04f, 0.391f, 1.437f, 0.0f)
                lineToRelative(3.782f, -3.639f)
                lineToRelative(3.782f, 3.639f)
                curveToRelative(0.397f, 0.391f, 1.04f, 0.391f, 1.437f, 0.0f)
                lineToRelative(3.782f, -3.638f)
                verticalLineToRelative(5.431f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _insertArrows!!
    }

private var _insertArrows: ImageVector? = null
