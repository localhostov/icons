package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowUpSmallBig: ImageVector
    get() {
        if (_arrowUpSmallBig != null) {
            return _arrowUpSmallBig!!
        }
        _arrowUpSmallBig = Builder(name = "ArrowUpSmallBig", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.69f, 4.28f)
                curveToRelative(0.4f, 0.38f, 0.42f, 1.01f, 0.04f, 1.41f)
                curveToRelative(-0.2f, 0.21f, -0.46f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.25f, 0.0f, -0.5f, -0.09f, -0.69f, -0.28f)
                lineToRelative(-3.31f, -3.15f)
                lineTo(7.01f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(5.01f, 2.57f)
                lineTo(1.69f, 5.72f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.37f, -1.41f, -0.04f)
                curveToRelative(-0.38f, -0.4f, -0.37f, -1.03f, 0.04f, -1.41f)
                lineTo(3.9f, 0.86f)
                curveToRelative(1.15f, -1.15f, 3.05f, -1.15f, 4.22f, 0.02f)
                lineToRelative(3.57f, 3.4f)
                close()
            }
        }
        .build()
        return _arrowUpSmallBig!!
    }

private var _arrowUpSmallBig: ImageVector? = null
