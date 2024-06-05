package me.localx.icons.rounded.bold

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

public val Icons.Bold.MoneyCheckEdit: ImageVector
    get() {
        if (_moneyCheckEdit != null) {
            return _moneyCheckEdit!!
        }
        _moneyCheckEdit = Builder(name = "MoneyCheckEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 10.0f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 14.413f)
                curveToRelative(0.0f, -1.476f, -0.885f, -2.783f, -2.255f, -3.331f)
                lineToRelative(-2.376f, -0.95f)
                curveToRelative(-0.591f, -0.216f, -0.411f, -1.15f, 0.218f, -1.132f)
                horizontalLineToRelative(1.181f)
                curveToRelative(0.181f, 0.0f, 0.343f, 0.094f, 0.434f, 0.251f)
                curveToRelative(0.415f, 0.717f, 1.334f, 0.962f, 2.05f, 0.547f)
                curveToRelative(0.717f, -0.415f, 0.962f, -1.333f, 0.548f, -2.049f)
                curveToRelative(-0.511f, -0.883f, -1.381f, -1.492f, -2.363f, -1.684f)
                curveToRelative(-0.399f, -1.442f, -2.588f, -1.375f, -2.896f, 0.091f)
                curveToRelative(-3.161f, 0.875f, -3.414f, 5.6f, -0.285f, 6.762f)
                lineToRelative(2.376f, 0.95f)
                curveToRelative(0.591f, 0.216f, 0.411f, 1.15f, -0.218f, 1.132f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(-0.181f, 0.0f, -0.343f, -0.094f, -0.434f, -0.25f)
                curveToRelative(-0.415f, -0.717f, -1.334f, -0.961f, -2.05f, -0.547f)
                curveToRelative(-0.717f, 0.415f, -0.962f, 1.333f, -0.548f, 2.049f)
                curveToRelative(0.511f, 0.883f, 1.381f, 1.491f, 2.363f, 1.683f)
                curveToRelative(0.399f, 1.442f, 2.588f, 1.375f, 2.896f, -0.091f)
                curveToRelative(1.469f, -0.449f, 2.54f, -1.817f, 2.54f, -3.431f)
                close()
                moveTo(18.5f, 1.0f)
                lineTo(5.5f, 1.0f)
                curveTo(2.468f, 1.0f, 0.0f, 3.467f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 6.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.295f, 19.481f)
                curveToRelative(-0.813f, 0.813f, -1.269f, 1.915f, -1.269f, 3.064f)
                curveToRelative(0.044f, 0.422f, -0.21f, 1.464f, 0.5f, 1.455f)
                curveToRelative(1.446f, 0.094f, 2.986f, -0.171f, 4.019f, -1.269f)
                lineToRelative(6.715f, -6.715f)
                curveToRelative(2.194f, -2.202f, -0.9f, -5.469f, -3.157f, -3.343f)
                lineToRelative(-6.808f, 6.808f)
                close()
            }
        }
        .build()
        return _moneyCheckEdit!!
    }

private var _moneyCheckEdit: ImageVector? = null
