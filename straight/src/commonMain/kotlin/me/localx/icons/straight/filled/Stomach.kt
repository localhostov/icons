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

public val Icons.Filled.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.959f, -2.598f, 2.838f, -3.138f, 3.0f)
                horizontalLineToRelative(-0.862f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.715f)
                curveToRelative(0.272f, 0.166f, 0.541f, 0.331f, 0.797f, 0.494f)
                curveToRelative(2.012f, 1.275f, 3.911f, 2.479f, 8.487f, 2.505f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.835f, 0.0f, 3.568f, -0.72f, 4.886f, -2.029f)
                curveToRelative(1.338f, -1.331f, 2.075f, -3.096f, 2.075f, -4.97f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(20.0f, 13.501f)
                curveToRelative(-0.348f, -0.209f, -1.008f, -0.501f, -2.0f, -0.501f)
                curveToRelative(-0.815f, 0.0f, -1.341f, 0.201f, -1.949f, 0.434f)
                curveToRelative(-0.693f, 0.266f, -1.479f, 0.566f, -2.664f, 0.566f)
                curveToRelative(-0.931f, 0.0f, -1.739f, -0.189f, -2.387f, -0.415f)
                verticalLineToRelative(-2.161f)
                curveToRelative(0.479f, 0.241f, 1.333f, 0.576f, 2.387f, 0.576f)
                curveToRelative(0.815f, 0.0f, 1.341f, -0.201f, 1.949f, -0.434f)
                curveToRelative(0.693f, -0.266f, 1.479f, -0.566f, 2.664f, -0.566f)
                curveToRelative(0.8f, 0.0f, 1.459f, 0.139f, 2.0f, 0.322f)
                verticalLineToRelative(2.179f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
